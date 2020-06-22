$(function(){
	var defaultMenu = ['사전','뉴스','증권','부동산','지도','영화','뮤직','책','웹툰'];
	var defaultMenuLink 
	= ['https://dict.naver.com/',
		'https://news.naver.com/',
		'https://finance.naver.com/',
		'https://land.naver.com/',
		'https://map.naver.com/',
		'https://movie.naver.com/',
		'https://vibe.naver.com/?from=naver_main',
		'https://book.naver.com/',
		'https://comic.naver.com/',
		]
	var selectMenu = []; // == 배열 
	var selectMenuLink =[];
	var allMenuLink =['모든 링크가 위에처럼 있어야함'];
	var tempMenu = []; // 내가 선택한 메뉴 임시로 저장 

	$('html').scrollTop(0);
	$('.btn-container-whale').click(function(e){
		$('.box-whale').addClass('display-none');
		//3일동안 보지 않기 버튼을 클릭했을 때 URL에 #이 붙는걸 방지
		e.preventDefault();
	})
	//자동 완성 버튼을 클릭하면 
	$('.btn-auto-search').click(function(){
		//자동 완성 기능이 활성화/비활성화
		$('.box-auto-box').toggleClass('display-none');
		//자동 완성 버튼 모양을 위로/아래로
		$('.icon-auto-search').toggleClass('active');
	})
	$('.link-auto-close').click(function(e){
		$('.btn-auto-search').click();
		e.preventDefault();
	})
	//더보기/접기 버튼 클릭 
    $('.btn-more').click(function(){
        $('.box-group-keyword').toggleClass('display-none');
        $('.box-service-menu.display').toggleClass('display-none');
        $('.box-container-servicelist').toggleClass('display-none');
		$('.btn-more').toggleClass('display-none');
		if ($(this).hasClass('fold')){
			initMenu();
		}
	})
	
	//메뉴설정에서 메뉴 선택시 
	$('.box-service-check').click(function(){
		var selMenu = $(this).text();
		// 이미 선택된 메뉴를 클릭해서 선택을 해제하는 경우 
		if(tempMenu.indexOf(selMenu) >=0){
		//indexof = 검색함수 없으면 -1 
			tempMenu.splice(tempMenu.indexOf(selMenu),1);
			//array.splice(start[, deleteCount[, item1[, item2[, ...]]]]) 메서드는 배열의 기존 요소를 삭제 또는 교체하거나 새 요소를 추가하여 배열의 내용을 변경합니다.
			$(this).find('input').prop('checked',false);
		//메뉴를 선택한 경우
		}else{
			if(tempMenu.length == 5 ){
				alert('최대5개까지 설정할 수 있습니다');
				return;
			}
			tempMenu.push(selMenu);
			//선택된 요소의 자손 중 input태그의 checked 속성을 true로 설정 
			$(this).find('input').prop('checked',true);
		}

		$(this).find('.icon-check').toggleClass('checked');
		var cnt = 0;
		var max = 5;
		$('.box-menu-black').each(function(){
			if (cnt < tempMenu.length){
				$(this).removeClass('box-empty select'); 
				// 여러 클래스를 한번에 지울려면 띄어쓰기로 구분한다.; 
				$(this).find('.link-menu-black').text(tempMenu[cnt]);
			}else{
				if(cnt == tempMenu.length && cnt < 5 ){
					$(this).addClass('select');
				} else{
					$(this).removeClass('select');
				} 
				$(this).addClass('box-empty')
				$(this).find('.link-menu-black').text('');
			}
				cnt++;
		})
	})



	//메뉴 설정 버튼 클릭 
	$('.btn-menu-set').click(function(){
		$('.box-service-menu.display').addClass('display-none');
		$('.box-service-menu.set').removeClass('display-none');
		$('.box-container-servicelist .container.display').addClass('display-none');
		$('.box-container-servicelist .container.set').removeClass('display-none');
		// 검은색 메뉴 박스 부분
		var cnt = 0;
		var max = 5; 
		$('.box-menu-black').each(function(){
			if (cnt < selectMenu.length){
			
			}
			else if(cnt < max){
				if(selectMenu.length == cnt)
						$(this).addClass('select');
					$(this).addClass('box-empty');
					$(this).find('.link-menu-black').text('');
					$(this).removeClass('display-none');
			} else{
				$(this).addClass('display-none');
			}
			cnt++;
		})

		$('.box-service-check input').each(function(){
			var isChecked = $(this).prop('checked');
			if(isChecked){
				$(this).siblings('.icon-check').addClass('checked')
			}
		})
	
	})

	//저장 버튼
		$('.btn-service-save').click(function(){
			selectMenu = tempMenu.slice();
			$('.fold').click();
		})

		$('.fold').click(function(){
			$('.box-menu-black').removeClass('box-empty select');
			var cnt = 0;
			var max = 5;
			$('.box-menu-black').each(function(){
				if(selectMenu.length != 0 ){
					if(cnt >= selectMenu.length)
						$(this).addClass('display-none');
				}else{
					$(this).removeClass('display-none');
					$(this).find('.link-menu-black').text(defaultMenu[cnt]);
				}
				cnt++;
			});
		})
		//기본 메뉴에서 메뉴 설정 클릭 후 메뉴를 선택 후 접기 버튼을 클릭하거나 
		// 메뉴 설정 클릭 후 메뉴를 선택하지 않고 접기 버튼을 클릭 
	
	//초기화 버튼 
	$('.btn-service-init').click(function(){
		alert('초기설정으로 돌아갑니다.');
		selectMenu = [];
		$('.box-service-check>input').prop('checked',false);	
		$('.fold').click();
	})


	function initMenu(){
		$('.box-service-menu.display').addClass('display-none');
		$('.box-service-menu.set').addClass('display-none');
		$('.box-container-servicelist .container.display').removeClass('display-none');
		$('.box-container-servicelist .container.set').addClass('display-none');	
		// 메뉴 설정에서 선택된 체크박스를 전부 해지 
		$('.icon-check').removeClass('checked');

	}
})