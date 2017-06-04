import webbrowser
class Movie ():

    def __init__ (self,movie_title,movie_storyline,poster_image,trailer_youtube): #self points to the object being created.
        print("hi")
        #instance variables
        self.title = movie_title
        self.storyline = movie_storyline
        self.poster_image_url = poster_image
        self.trailer_youtube_url = trailer_youtube
    #instance method
    def show_trailer(self):
        webbrowser.open(self.trailer_youtube_url)
