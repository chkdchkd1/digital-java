$(function(){
    var newsRolling = setInterval(function(){
        $('.line-issue').first().animate({'margin-top':'-24px'},700,function(){
            $(this).detach().appendTo('.list-issue').css('margin-top','0px');
            $(this).removeAttr('style')
        });
    },2000)


})

