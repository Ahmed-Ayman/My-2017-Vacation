#!/usr/bin/python3
# Uses python3
n=int(input())
a= [int(x) for x in input().split()]
a.sort()
print(a[len(a)-1]*a[len(a)-2])
