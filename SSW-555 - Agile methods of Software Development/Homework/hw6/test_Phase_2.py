from unittest import TestCase
import datetime
import hw6_Phase_2

today = datetime.date.today()
d1 = datetime.date(2000, 1, 1)
d2 = datetime.date(2016, 10, 3)


class TestDiff_between_dates(TestCase):
    def test_diff_between_dates(self):
        self.assertLess(d1, today, str(d1) + " is after current date")
        self.assertLess(d2, today, str(d2) + " is after current date")
        self.assertIsInstance(d1, datetime.date, "Type error")
        self.assertIsInstance(d2, datetime.date, "Type error")
        self.assertGreater(hw6_Phase_2.diff_between_dates(d1, d2), 0, "Invalid order of arguments")
        self.assertEqual(hw6_Phase_2.diff_between_dates(d1, d2), 6120)  # phase 1 test (1 of many)
        self.assertEqual(hw6_Phase_2.diff_between_dates(d1, d2, 'd'), 6120)  # phase 2 test (1 of many)
