from unittest import TestCase
import datetime
import hw6

today = datetime.date.today()
d1 = hw6.date1
d2 = hw6.date2

class Test_dates(TestCase):
    def test_number_of_days_between_two_dates(self):
        self.assertLess(d1, today, str(d1) + " is after current date")
        self.assertLess(d2, today, str(d2) + " is after current date")

    def test_number_of_months_between_two_dates(self):
        self.assertIsInstance(d1, datetime.date, "Type error")
        self.assertIsInstance(d2, datetime.date, "Type error")

    def test_number_of_years_between_two_dates(self):
        delta = d1 - d2
        self.assertLess(delta.days, 0, "Invalid order of arguments")
