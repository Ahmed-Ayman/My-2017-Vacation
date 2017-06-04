import webbrowser
class Movie ():
    '''those are documentation to my class ,,it will be saved in the ___doc__ varialbe
        you can check them by printing .. media.Movie.__doc__
    '''
    # here I could create a class varialbe -> associated with all variables
    # eg,. Ratings
    VALID_RATINGS =["G","PG","PG-13","R"]
    def __init__ (self,movie_title,movie_storyline,poster_image,trailer_youtube): #self points to the object being created.
        #instance variables
        self.title = movie_title
        self.storyline = movie_storyline
        self.poster_image_url = poster_image
        self.trailer_youtube_url = trailer_youtube
    #instance method
    def show_trailer(self):
        webbrowser.open(self.trailer_youtube_url)
