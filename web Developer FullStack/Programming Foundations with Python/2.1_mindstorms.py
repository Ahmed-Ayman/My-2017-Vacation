#/usr/bin/python3
"""
using turtle library to draw some shape.

in this lesson we are going to figure out the classes concept.
since functions aren't useful at some point when we want to create many copies from one thing.
like movie(name,url,....)
then we would use classes with some defined functions

class : is like a blue brint with some predefinded infrmation about this thing.

"""
import turtle

def square(some_turtle):
    for i in range(4):
        some_turtle.forward(100)
        some_turtle.right(90)

def  draw_shape():
    window  = turtle.Screen()
    window.bgcolor("white")
    brad=turtle.Turtle()
    brad.shape("circle")
    brad.color("black")
    brad.speed(10)
    for i in range(100):
        square(brad)
        brad.right(10)

    window.exitonclick()
draw_shape()
