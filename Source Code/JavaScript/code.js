
function switchAges(){
    let temp = document.getElementById("your_age").value;
    document.getElementById("your_age").value = document.getElementById("her_age").value;
    document.getElementById("her_age").value = temp;
}

function shouldI(){
    let your_age = document.getElementById("your_age").value;
    let her_age = document.getElementById("her_age").value;

    if(your_age < 16 && her_age < 14)
    alert("You are "+your_age+" man,and she is only "+her_age+" ,Dont think about it!");
    else if(your_age < 16)
    alert("You are "+your_age+" man, you too young!");
    else if(her_age < 14)
    alert("She is only "+her_age+" , Dont think about it!");
    else if(your_age > (her_age/2+7) && your_age < (her_age*2-14))
    alert("Absolutly, DO IT!");
    else
   alert("Not the right one, there is a big difference of age");    
}