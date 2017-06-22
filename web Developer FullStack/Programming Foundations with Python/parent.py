"""
an example of inheritance
reusing the code of the parent
"""
class Parent ():
    def __init__ (self,last_name,eye_color):
    #    print  ("parent's color")
        self.last_name = last_name
        self.eye_color= eye_color

    def show_info(self):
        print ("last name --> " + self.last_name)
        print ("eye color -->"+ self.eye_color )

class Child (Parent):
    def __init__ (self,last_name,eye_color,number_of_toys):
    #    print("child's constructor ")
        Parent.__init__(self,last_name,eye_color)
        self.number_of_toys=number_of_toys


    def show_info (self):
        print ("last name --> " + self.last_name)
        print ("eye color -->"+ self.eye_color )
        print ("toys ->" + str(self.number_of_toys) )

#parent = Parent("ayman","blue")
#print(parent.last_name)

ahmed_ayman2 = Child("ayman","blue",15)
print(ahmed_ayman2.show_info())
