'''
this program checks out a text file and tells you if it has curse words or not.
'''
def read_text():
    # text file to be checked
    f= open('/home/ahmed-ayman/Workspace/2017_materials/Full_stack/movie_quotes.txt')
    content = f.read()
    print(check_profanity(content))
    f.close()
def check_profanity(text):
    import urllib.request # urllib.request in py3
    text=urllib.request.pathname2url(text) #to handle the white spaces in the path
    connect=urllib.request.urlopen("http://www.wdylike.appspot.com/?q="+text)
    output=connect.read()
    connect.close()
    #it's a binary mode , so you have to use b..
    if b"true" in output:
        return "Profanity Alert!!!"
    elif b"false" in ouput :
        return "no curse words"
    else:
        return "something went wrong while scaning"
read_text()
