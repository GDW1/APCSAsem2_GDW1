var btn = document.createElement('BUTTON');
var t = document.createTextNode('EGGGGGGGGGGGGG');
var btnT = document.createElement('BUTTON');
var tT = document.createTextNode('search');
var toOpen = document.getElementById('scungle');
var a = document.createElement("FORM");
a.setAttribute("id", "myForm");
document.body.appendChild(a);
var b = document.createElement("INPUT");
b.setAttribute("type", "text");
b.setAttribute("id", "searching");
b.setAttribute("value", "Is that a Yolk?!?!?!?");
document.getElementById("myForm").appendChild(b);
sound = document.getElementById("myAudio")
var alpha = [
    'a',
    'b',
    'c',
    'd',
    'e',
    'f',
    'g',
    'h',
    'i',
    'j',
    'l',
    'm',
    'n',
    'o',
    'p',
    'q',
    'r',
    's',
    't',
    'u',
    'v',
    'w',
    'x',
    'y',
    'z',
];
btn.appendChild(t); // Append the text to <button>
btnT.appendChild(tT); // Append the text to <button>
document.body.appendChild(btnT);
document.body.appendChild(btn);
btn.addEventListener('click', function() {
    document.getElementById('heyo').style.color = generateHex(alpha);
    document.getElementById('scungle').style.color = generateHex(alpha);
    document.getElementById('scungle').innerHTML = randomWord(alpha);
    toOpen.style.fontSize = Math.floor(Math.random() * 50);

});
btnT.addEventListener('click', function() {
    if(document.getElementById("searching").value=='yolk')
    {
        document.getElementById('scungle').innerHTML = "Is that a jojo reference";
        console.log('yo');
    }else if(document.getElementById("searching").value=='jojo')
    {
        console.log('sound play');
        sound.play();
    }else if(document.getElementById("searching").value=='morty')
    {
        document.body.style.backgroundImage = "url('http://i0.kym-cdn.com/photos/images/facebook/001/282/726/110.png')";
        document.getElementById('scungle').innerHTML = "Im Pickle Rick!!!!";
        document.getElementById('scungle').style.font = "bold 50px Impact";

    }else if(document.getElementById("searching").value=='undertale'||document.getElementById("searching").value=='sans')
    {
        document.body.style.backgroundImage = "url('https://pm1.narvii.com/6151/e45a49d8b62d59d1fe7656904825ffd26a837c59_hq.jpg')";
        document.getElementById('scungle').innerHTML = "Sans Undertale";
        document.getElementById('scungle').style.font = "bold 20px Comic Sans MS";
    }
});
function randomNumOrLet(alphaArr) {
    var x = Math.floor(Math.random() * 2);
    if (x == 1) {
        return alphaArr[Math.floor(Math.random() * 5)];
    } else {
        return Math.floor(Math.random() * 9);
    }
}
function generateHex(alpha) {
    y = ('#' +
        randomNumOrLet(alpha) +
        randomNumOrLet(alpha) +
        randomNumOrLet(alpha) +
        randomNumOrLet(alpha) +
        randomNumOrLet(alpha) +
        randomNumOrLet(alpha)).toString();
    return y;
}
function randomWord(alpha) {
    var sentence = '';
    for (var i = 0; i < Math.floor(Math.random() * 100); i++) {
        for (var i = 0; i < Math.floor(Math.random() * 25); i++) {
            sentence = sentence.concat(randomLetter(alpha));
        }
        sentence = sentence.concat(' ');
    }
    return sentence;
}
function randomLetter(alphaText) {
    x = alphaText[Math.floor(Math.random() * 25)];
    return x;
}
function myFunction() {
    var x = document.createElement("FORM");
    x.setAttribute("id", "myForm");
    document.body.appendChild(x);

    var y = document.createElement("INPUT");
    y.setAttribute("type", "text");
    y.setAttribute("value", "Is that a Yolk?!?!?!?");
    document.getElementById("myForm").appendChild(y);
}
