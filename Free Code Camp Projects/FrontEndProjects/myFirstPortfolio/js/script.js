
//the navigation
$(document).ready(function (){
          goFromTo("#about_anchor","#about");
          goFromTo("#projects_anchor","#projects");
          goFromTo("#contact_anchor","#contact");

});

function goFromTo(id_1,id_2){
  $(id_1).click(function (){
      $('html, body').animate({
          scrollTop: $(id_2).offset().top
      }, 1000);
  });
}


//the slider
$('.list-group-item').on('click', function() {
var $this = $(this);
var panel_title= $("#panel_title");
var new_title=$this.text();
panel_title.text(new_title);
//toggle active
$('.active').removeClass('active');
$this.toggleClass('active');
changePanelContent($this);
// Pass clicked link element to another function
});
function changePanelContent($this){
var clicked = $this.text();
var panelItem=$('#panel');
var learningLanguages = '<h4>Learning languages is one of the beautiful things in my life..by learning languages I learn how to respecct the other cultures .. learn how to be a real human! </h4><h5>I already speak the following languges :-</h5> <ul  style="font-size:15px;"> <li>Arabic  ..(native)</li> <li>English .. (Fluent)</li> <li>Indonesian .. (basic conversations)</li> <li>a little bit of Korean and Japanese.</li> </ul>';
var coding ='<h3>I can code in :-</h3> <ul> <li>Python</li> <li>Java Script</li> <li>Java</li> <li>html &amp; css</li> </ul>';
var Reading = ' <h3>I love reading about</h3> <ul> <li>Economics</li> <li>Artificial intelligence</li> <li>Data sceience</li> </ul>';
var Hanging_out = '<h3>I usually hang out with friends from different countries, I had many hang outs with hangouts with friends from Korea, Canada, China and indonesia who came to visit Egypt.</h3>';
if (clicked =="learning languages")
panelItem.html(learningLanguages);
else if (clicked =="coding")
panelItem.html(coding);
else if (clicked =="Reading")
panelItem.html(Reading);
else {
  panelItem.html(Hanging_out);
}
}
