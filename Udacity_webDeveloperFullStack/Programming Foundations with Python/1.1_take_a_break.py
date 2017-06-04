#!/usr/bin/python3
"""
the project idea
---------------
i need an application to remind me to take
a break after x amount of time by opening
the browser and opening example.com website.
"""
import webbrowser ,time

# takes the number of breaks per day (2 times be default)
# also takes the delay time in hours (by default 2 hours)
def take_break(nBreaksPerDay=2, DelayTime=2):
    total_breaks=nBreaksPerDay
    breaks_count=0

    print ("the program started working at "+time.ctime())
    while total_breaks>breaks_count:
        time.sleep(DelayTime*60*60) # sleep function takes seconds.
        webbrowser.open("http://www.example.com")
        breaks_count+=1
take_break()


"""
using thread
from threading import Thread

def timer ():
    count=0
    while True:
        time.sleep(5)
        count+=1
        print("1")
        webbrowser.open("http://www.example.com")
#backThread = Thread(target=timer)
#backThread.start()

"""
