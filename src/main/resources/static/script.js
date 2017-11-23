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
    $.getJSON('https://immense-citadel-59192.herokuapp.com/'+sequence, {format:"json"}, function(data){
        $(".results").empty();
        for(var i = 0; i<6; i++){
            var update ='<div class="col-md-4 frame">'
            '</div>';
            var frameNumber = i+1;
            var details = "5'-3' Frame: "+frameNumber;
            if (frameNumber>3){
                details = "3'-5' Frame: "+frameNumber;
                frameNumber-=3;
            }
            update+='<h6>'+details+'</h6>';
            var frame = data.frames[i];
            for(var j =0; j<frame.length;j+=35){
                var n =j+1;
                update+='<small class="float-left">'+spacer(frame.substring(j,j+40))+'</small>';
                update += '<small class="float-right">'+n+"<br>"+'</small>';

            }
            $(".results").append(update);
        }
        }
    );
}
function spacer(str) {
    return "\t"+str;//str.substring(0,l/2)+"\t"+str.substring(l/2);
}