//問1
document.write("問1<br>");
for(i=1;i<=5;i++){
    for(a=1;a<=5;a++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>")

//問2
document.write("問2<br>");
for(i=1;i<=5;i++){
    for(a=1;a<=5;a++){
        if(i==a){
            document.write("☆");
        }
        else{
            document.write("★");
        }
    }
        document.write("<br>");
}
document.write("<br>")

//問3
document.write("問3<br>");
for(i=1;i<=5;i++){
    for(a=1;a<=5;a++){
        if(i==a){
            document.write("☆")
        }
        else{
            document.write("★");
        }
    }
        document.write("<br>");
}
document.write("<br>")

//問4
document.write("問4<br>");
for(i=1;i<=5;i++){
    for(a=1;a<=5;a++){
        if(i>=a){
            document.write("★");
        }
    }
        document.write("<br>");
}
document.write("<br>")


//問5
document.write("問5(考え1)<br>");
for(i=0;i<5;++i){
    for(a=1;a<=5;a++){
        if(i>=a){
            document.write("★");
        }
    }
        document.write("☆<br>");
}
document.write("<br>")

document.write("問5(考え2)<br>");
for(i=1;i<=5;++i){
    for(a=1;a<=5;a++){
        if(i==a){
            document.write("☆");
        }
        else if(i>=a)
                {
            document.write("★");
        }
    }
        document.write("<br>");
}