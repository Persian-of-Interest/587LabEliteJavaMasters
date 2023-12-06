import argparse
from datetime import datetime


class MyThermo:
    def __init__(self):
        self.rmin = 69
        self.rmax = 73
        self.tmpr = None
        self.tstart = None
        self.tend = None

    def set_range(self, rmin, rmax):
        self.rmin = rmin
        self.rmax = rmax
        print(f"Range {self.rmin} - {self.rmax} is set till you decide to reset")

    def set_temperature(self, tmpr, tstart, tend=None):
        self.tmpr = tmpr
        self.tstart = tstart
        self.tend = tend
        self.rmin = self.rmax = None
        tend_str = f" till {self.tend}" if self.tend else ""
        print(f"The temperature is set to {self.tmpr} starting {self.tstart}{tend_str}")

    def reset(self):
        self.rmin = 69
        self.rmax = 73
        self.tmpr = None
        self.tstart = None
        self.tend = None
        print(f"The values are reset to defaults {self.rmin}, {self.rmax}")


def main():
    parser = argparse.ArgumentParser(description="MyThermo Command Line Thermostat")
    parser.add_argument("-rmin", type=int, help="Minimum range temperature")
    parser.add_argument("-rmax", type=int, help="Maximum range temperature")
    parser.add_argument("-tmpr", type=int, help="Set specific temperature")
    parser.add_argument("-tstart", help="Start time for temperature setting")
    parser.add_argument("-tend", help="End time for temperature setting")
    parser.add_argument("--reset", action="store_true", help="Reset to default settings")

    args = parser.parse_args()

    thermo = MyThermo()

    if args.reset:
        thermo.reset()
    elif args.tmpr is not None:
        if args.tstart is None:
            parser.error("tstart is required when setting a specific temperature")
        try:
            tstart = datetime.strptime(args.tstart, "%H:%M")
            tend = datetime.strptime(args.tend, "%H:%M") if args.tend else None
            thermo.set_temperature(args.tmpr, tstart, tend)
        except ValueError:
            parser.error("Invalid time format. Use HH:MM.")
    elif args.rmin is not None or args.rmax is not None:
        rmin = args.rmin if args.rmin is not None else 69
        rmax = args.rmax if args.rmax is not None else 73
        if 62 <= rmin <= 78 and 62 <= rmax <= 78:
            thermo.set_range(rmin, rmax)
        else:
            parser.error("Range must be between 62 and 78.")
    else:
        parser.print_help()


if __name__ == "__main__":
    main()