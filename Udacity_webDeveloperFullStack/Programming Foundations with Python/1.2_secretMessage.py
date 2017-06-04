#!/usr/bin/python2
#take care of translate in V2 and V3

"""
the problem :
    we want to rename some files by removing the digits from their names
    then sorting those files.

solution:
   - using os library.
   - firstly I will go to the directory.
   - get an array of the files -> os.listdir().
   - replace the number in their names by a blank -> "".
"""
import os

def rename_files():
    current=os.getcwd()
    #the directory path
    path='/home/ahmed-ayman/Workspace/2017_materials/Full_stack/prank'
    os.chdir(path)
    files=os.listdir(path)
    for i in files:
        #tranlate (refrence  , any of those chars)
        os.rename(i,i.translate(None,'0123456789')) # this will replace any digide by the refrence which is None
    os.chdir(current)

rename_files()

'''
notes :
= > trying to rename a file that isn't existed will give you an error  {No such file or directory}
= > trying to rename a file where there's already a name with the same file, would overwrite the original file.
'''
