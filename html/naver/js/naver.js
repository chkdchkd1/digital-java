$(function(){
    $('html').scrollTop(0);
    $('.btn-container-whale').click(function(e){
        //$(this).parents('.box-whale').remove();
        $('.box-whale').addClass('display-none');
        e.preventDefault();
        //이벤트가 발생하면 주소창에 #뜨는걸 막아줌 
    })

    

    $('.off').click(function(e){
        $('.btn-autocomplete').click();
        e.preventDefault();
    })

    $('.btn-autocomplete').click(function(){
    //자동 완성 기능이 활성화/비활성화
        $('.autowindow').toggleClass('display-none');
    //자동 완성 버튼 모양을 위로/아래로
        $('.ico-complete').toggleClass('active');
    })
    
    $('.btn-more').click(function(){
        $('#box-container-menu').toggleClass('ly-open');
        if ( $('.btn-more').text() =='더보기'){
            $('.btn-more').text('접기');
        }else{
            $('.btn-more').text('더보기');
        }
        if ($('#box-container-menu').hasClass('ly-open')){
            initMenu();
          }
    })
    
    $('.service-data input').click(function(){
        $(this).parents('dd').toggleClass('chk-check')
    })
    
    $('.btn-set').click(function(){
        $('.fav-edit-ly').removeClass('display-none');
        $('.fav-all-ly').addClass('display-none');
        $('.fav-list').addClass('display-none');
        $('.type-empty').removeClass('display-none');
        $('.btn-ly-area a').toggleClass('display-none');
    })

    // 초기화 버튼 
    function initMenu(){
        $('.fav-edit-ly').addClass('display-none');
        $('.fav-all-ly').removeClass('display-none');
        $('.fav-list').removeClass('display-none');
        $('.type-empty').addClass('display-none');
        $('.btn-reset').addClass('display-none');
        $('.btn-save').addClass('display-none');
        $('.btn-set').removeClass('display-none');
        $('.fav-all').removeClass('display-none');
        $('.service-data input').parents('dd').removeClass('chk-check');
    }


 })