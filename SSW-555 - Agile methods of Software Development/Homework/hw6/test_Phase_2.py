from unittest import TestCase
import datetime
import hw6_Phase_2

today = datetime.date.today()
d1 = hw6_Phase_2.date1
d2 = hw6_Phase_2.date2

class TestDiff_between_dates(TestCase):
    def test_diff_between_dates(self):
        self.assertLess(d1, today, str(d1) + " is after current date")
        self.assertLess(d2, today, str(d2) + " is after current date")
        self.assertIsInstance(d1, datetime.date, "Type error")
        self.assertIsInstance(d2, datetime.date, "Type error")
        self.assertGreater(hw6_Phase_2.delta.days, 0, "Invalid order of arguments")