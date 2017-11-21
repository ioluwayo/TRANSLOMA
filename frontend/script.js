function loadWikiApi(value){
    $.getJSON('http://localhost:8080/api/translate?sequence=AUGGGGG',{
            format:"json"
        },function(data){
            alert(data.frame2);
        }
    );}
loadWikiApi();