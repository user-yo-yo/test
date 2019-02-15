//問1
document.write("問1<br>")
function menseki(radius){
    return"半径"+radius+"㎝の面積は"+radius*radius+"㎝2";
}
document.write(menseki(5));
document.write("<br>")
document.write(menseki(7));
document.write("<br>")
document.write(menseki(10));

document.write("<br><br>")


//問2
document.write("問2<br>")
function nyujo(otona,kodomo){
    var A=500*otona+200*kodomo;
    return "グループの合計は" + A + "円です。"
}
document.write("A"+nyujo(2,4));
document.write("<br>");
document.write("B"+nyujo(1,5));
document.write("<br>");
document.write("C"+nyujo(3,7));