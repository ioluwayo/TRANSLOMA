$(document).ready(function() {


});
function reset(blah) {
    alert("ADAD");
}

function submitFunction() {
    var sequence = $('textarea').val();
    if(sequence === ''){
        alert("You have to enter a sequence.");
    }
    $.getJSON('http://localhost:8080/api/translate?sequence='+sequence,{
            format:"json"
        },function(data){
            console.log(data.sequence);
            console.log(data.length);
            console.log(data.frame1);
            console.log(data.frame2);
            console.log(data.frame3);
            console.log(data.reverseFrame1);
        }
    );
}