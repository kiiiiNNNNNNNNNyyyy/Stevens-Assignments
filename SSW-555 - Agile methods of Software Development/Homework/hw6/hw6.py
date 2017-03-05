import datetime

date1 = datetime.date(2000, 1, 1)
date2 = datetime.date(2016, 10, 3)

def number_of_days_between_two_dates(date_1,date_2):
	delta = date2 - date1
	print("No of days between " + str(date_1) + " and " + str(date_2) + " are " + str(delta.days))
	return int(delta.days)

def number_of_months_between_two_dates(date_1,date_2):
	delta = date2 - date1
	months = int(delta.days/30.4)
	print("No of months between " + str(date_1) + " and " + str(date_2) + " are " + str(months))
	return months

def number_of_years_between_two_dates(date_1,date_2):
	delta = date2 - date1
	years = int(delta.days/365.25)
	print ("No of years between " + str(date_1) + " and " + str(date_2) + " are " + str(years))
	return years

if __name__ == '__main__':
	print(number_of_days_between_two_dates(date1,date2))
	print(number_of_months_between_two_dates(date1,date2))
	print(number_of_years_between_two_dates(date1,date2))