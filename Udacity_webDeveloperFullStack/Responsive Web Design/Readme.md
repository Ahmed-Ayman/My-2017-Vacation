#  [responsive web design course](https://classroom.udacity.com/courses/ud893)

in this course I have learned :-
* what is the browser emulators and how to create a custom one.
* how to debug remotely using Chrome://inspect page.
*  Device independent pixels=> physical over 2.
* normally runs as 980 px...without font boosting
* The viewport and the device pixel ratio are both likely causes for the differences between devices.
So, Don't fotget to set the viewport
''' html
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
'''
* use the relative not the absolute.
* min width and height for button should be -> 48 * 48.
* media queries like => <link media="screen and (min-width:500px) " href="over500.css">.
also it's like what we have used in the HTML course @screen and (min-width:500px) { do some style.}
and @import but we won't use it for performance matters.
@media screen and (css) [and/or (css)]

* applied on the Media query concept. @media when the screen between 401 and 600 -> red ...else green.
* break points to manage more than device.
* flex box is a very powerful tool for making responisce layouts
* patterns :

  * column drop :  small screen -> 3 divs (100%) , 25% 75% and 100% (width > 450px),  25% 50% 25% (width > 550px)

  * mostly fluid :  small screen -> (width : 100%), (width > 450px ) 100% then 2 * 50 % then all are 100%, (width > 550px) 50% 50% 33% for the rest ,  (width > 700)-> margin to the side.
  * layout shifter
  * off canvas : hamburger icon.

* Images take 65% of every website.
* 45 - 90 chars per line.

[summary of the patterns](https://developers.google.com/web/fundamentals/design-and-ui/responsive/patterns#off_canvas)

and I have created my first responsive web app using the Flex tool.
