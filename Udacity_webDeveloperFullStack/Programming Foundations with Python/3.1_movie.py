'''
crating a webpage that displays some movies and its trailers.
I have created a Json files with the data (cause it's nicer than just adding
one file).
-> a good practice to seperate the class in another file.
'''

import media, json , fresh_tomatoes
file = open ('movies.json') #opening the json file to get the content
content= json.load(file) # Json Library -> getting the objects
file.close()
movies=[]
for obj in content :
    movie= media.Movie(obj['title'],obj['storyLine'],obj['poster'],obj['trailer_youtube']) #creating objects with the data
    movies.append(movie) #passing the objects to the list of movies
fresh_tomatoes.open_movies_page(movies)

#movies[0].show_trailer()
#print(media.Movie.VALID_RATINGS)
#print(media.Movie.__doc__) --> documentation
#print(media.Movie.__name__) --> name
#print(media.Movie.__module__) --> module name
