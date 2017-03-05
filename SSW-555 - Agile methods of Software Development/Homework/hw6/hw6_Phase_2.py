import datetime

date1 = datetime.date(2000, 1, 1)
date2 = datetime.date(2016, 10, 3)
delta = date2 - date1

def diff_between_dates(date_1, date_2):
    print("No of days between " + str(date_1) + " and " + str(date_2) + " are " + str(delta.days))
    print("No of months between " + str(date_1) + " and " + str(date_2) + " are " + str(int(delta.days / 30.4)))
    print("No of years between " + str(date_1) + " and " + str(date_2) + " are " + str(int(delta.days / 365.25)))

if __name__ == '__main__':
    diff_between_dates(date1, date2)