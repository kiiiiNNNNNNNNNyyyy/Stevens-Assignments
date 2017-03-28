import datetime

date1 = datetime.date(2000, 1, 1)
date2 = datetime.date(2016, 10, 3)

def diff_between_dates(date_1, date_2, units = None):
    delta = date2 - date1
    if units == 'd' or units == 'D' or units is None:
        print("No of days between " + str(date_1) + " and " + str(date_2) + " are " + str(delta.days))
        return int(delta.days)
    elif units == 'm' or units == 'M':
        print("No of months between " + str(date_1) + " and " + str(date_2) + " are " + str(int(delta.days / 30.4)))
        return int(delta.days / 30.4)
    elif units == 'y' or units == 'Y':
        print("No of years between " + str(date_1) + " and " + str(date_2) + " are " + str(int(delta.days / 365.25)))
        return int(delta.days / 365.25)
    else:
        print("Invalid Input")

if __name__ == '__main__':
    diff_between_dates(date1, date2, 'd')
    diff_between_dates(date1, date2, 'm')
    diff_between_dates(date1, date2, 'y')
    diff_between_dates(date1, date2)

