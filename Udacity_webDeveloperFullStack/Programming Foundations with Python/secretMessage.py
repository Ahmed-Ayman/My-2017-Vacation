#!/usr/bin/python3

import os

"""
the problem :
    we want to rename some files by removing the digits from their names
    then sorting those files.

solution:
   - using os library.
   - firstly I will go to the directory.
   - get an array of the files.
   - replace the number in their names by "".
"""
os.chdir('prank')
files=os.listdir()
for item in files:
    table=item.maketrans("","",remove)
    os.rename(item,item.(None , "0123456789"))
