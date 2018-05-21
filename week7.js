// JavaScript source code
//Sirak Berhane 
// Week 7 js
//April 30 2018 

// naming canvas
var canvas, cav;

// Lamp 
var z = 0;

//declar shapes
var tb1Top, tb1Rect, leg1, leg2, leg3, leg4, shade1, semicircle, trap,
    curvRect, rect, base1, base2, shade2, inside, lightbulb;

// assign color ;
tb1Top = "#966f33";
tb1Rect = leg1 = leg2 = leg3 = leg4 = "#785115";
shade1 = "#E60093";
semicircle = trap = curvRect = rect = base1 = "#804000";
base2 = shade2 = "#ff0000";
inside = "#8b0000";
lightbulb = "#ffff00";

function titleAndDate() {
    //creating a canvas
    canvas = document.getElementById("myCanvas");
    cav = canvas.getContext("2d");
    cav.strokeStyle = "black";
    cav.lineWidth = 3;
    //text style
    cav.save();
    cav.lineWidth = 2;
    cav.fillStyle = "aquamarine";
    cav.font = "30px Times New Roman";
    cav.textAlign = "center";
    //adding shadow
    cav.shadowOffsetX = 5;
    cav.shadowOffsetY = 5;
    cav.shadowBlur = 5;
    cav.shadowColor = "grey";
    //title
    cav.fillText("Lamp Activity", canvas.width/2, 35);
    cav.strokeText("Lamp Activity", canvas.width / 2, 35);
    //date
    var createDate = new Date();
    var formattedDate = createDate.toLocaleDateString();
    cav.fillText(formattedDate, canvas.width / 2, 80);
    cav.strokeText(formattedDate, canvas.width / 2, 80);
    
}
function drawTable() {
    cav.restore(); //restore to selected settings
    // drawing tabletop
    cav.beginPath();
    cav.moveTo(50, 400);
    cav.lineTo(750, 400);
    cav.lineTo(650, 300);
    cav.lineTo(150, 300);
    cav.closePath();
    cav.fillStyle = tb1Top;
    cav.stroke();
    cav.fill();
    //drawing the underneath rectangle for 3d
    cav.fillStyle = tb1Rect;
    cav.strokeRect = (49, 402, 702, 30);
    cav.fillRect = (49, 402, 702, 30);
    //drawing table legs
    cav.fillStyle = leg1;
    cav.strokeRect(65, 434, 30, 150);
    cav.fillRect(65, 434, 30, 150);
    //second leg
    cav.fillStyle = leg2;
    cav.strokeRect(705, 434, 30, 150);
    cav.fillRect(705, 434, 30, 150);
    //third leg
    cav.fillStyle = leg3;
    cav.strokeRect(150, 434, 25, 50);
    cav.fillRect(150, 434, 25, 50);
    //fouth leg
    cav.fillStyle = leg4;
    cav.strokeRect(625, 434, 25, 50);
    cav.fillRect(624, 434, 25, 50);
    
}
function drawLamp1() {
    //drawing first lamp from top to bottom
    cav.restore();// restore selected settings
    // drawing lamp shad 
    cav.beginPath();
    cav.moveTo(140 + z, 105);
    cav.lineTo(200 + z, 105);
    cav.lineTo(255 + z, 205);
    cav.lineTo(85 + z, 205);
    cav.closePath();
    cav.fillStyle = shade1;
    cav.stroke();
    cav.fill();

    //drawing the semi-circle
    cav.beginPath();
    cav.arc(170 + z, 207, 10, 0, Math.PI);
    cav.closePath();
    cav.fillStyle = semicircle;
    cav.stroke();
    cav.fill();

    //drawing trapezoid
    cav.beginPath();
    cav.moveTo(165 + z, 219);
    cav.lineTo(175 + z, 219);
    cav.lineTo(185 + z, 239);
    cav.lineTo(155 + z, 239);
    cav.closePath();
    cav.fillStyle = trap;
    cav.stroke();
    cav.fill();
    //draw rectangle with curved sides
    cav.beginPath();
    cav.moveTo(185 + z, 239);
    cav.quadraticCurveTo(210 + z, 280, 186 + z, 320);
    cav.lineTo(154 + z, 320);
    cav.quadraticCurveTo(130 + z, 280, 155 + z, 239);
    cav.closePath();
    cav.fillStyle = curvRect;
    cav.stroke();
    cav.fill();
    //draw rectangle 
    cav.fillStyle = rect;
    cav.strokeRect(154 + z, 322, 32, 10);
    cav.fillRect(154 + z, 322, 32, 10);
    //draw base of lamp 
    cav.beginPath();
    cav.moveTo(188 + z, 334);
    cav.bezierCurveTo(188 + Z, 350, 230 + Z, 350, 230 + Z, 360);
    cav.lineTo(110 + z, 360);
    cav.bezierCurveTo(110 + z, 350, 152 + z, 350, 152 + z, 334);
    cav.closePath();
    ct.fillStyle = base1;
    cav.stroke();
    cav.fill();
    
    //draw lines
    cav.beginPath();
    cav.moveTo(205 + z, 207);
    cav.lineTo(205 + z, 250);
    cav.lineWidth = 2;
    cav.stroke();
    cav.fill();

    //draw circle
    cav.beginPath();
    cav.moveTo(205 + z, 250);
    cav.arc(205 + z, 253, 2, 0, 2 * Math.PI);
    cav.stroke();

}

function drawLamp2() {

    cav.restore();

    cav.beginPath();
    cav.moveTo(600, 360);
    cav.quadraticCurveTo(650, 310, 700, 360);
    cav.closePath();
    cav.fillStyle = base2;
    cav.stroke();
    cav.fill();
    cav.save();// saves the drawing before rotation

    // rectangle pointing towards upper right corner
    cav.translate(650, 340);
    cav.rotate(5.2) // rotates 5.2 degree radians 
    cav.rect(0, 0, 150, 5);
    cav.stroke();
    cav.fill();

    cav.restore();
    cav.save();

    //draw rectangel pointing toward upper left corner
    cav.translate(720, 112); // from (0,0)  to (720,112)
    cav.rotate(3.8);// rotate 3.8  degree radians 
    cav.rect(0, 0, 150, 5);
    cav.stroke();
    cav.fill();
    //draw square on top lamp side
    cav.translate(610, 115);
    cav.rotate(2.2);
    cav.rect(0, 0, 25, 25);
    cav.stroke();
    cav.fill();

    cav.restore();
    cav.save();

    // draw lamp button
    cav.beginPath();
    cav.lineCap = "round";
    cav.lineWidth = 10;
    cav.moveTo(600, 102);
    cav.lineTo(601.5, 100);
    cav.stroke();

    cav.restore();
    cav.save();

    //draw lamp shade
    cav.beginPath();
    cav.moveTo(595, 137);
    cav.lineTo(574, 121);
    cav.quadraticCurveTo(540, 120, 520, 160);
    cav.quadraticCurveTo(565, 160, 585, 203);
    cav.quadraticCurveTo(610, 170, 595, 137);
    cav.fillStyle = shade2;
    cav.stroke();
    cav.fill();

    //draw inside of lamp
    cav.beginPath();
    cav.moveTo(520, 160);
    cav.quadraticCurveTo(565, 160, 585, 203);
    cav.quadraticCurveTo(545, 200, 520, 160);
    cav.fillStyle = inside;
    cav.stroke();
    cav.fill();
    cav.clip();// to hide some parts of the light bulb inside the lamp shade.

    //draw lightbulb
    cav.shadowOffsetX = -5;
    cav.shadowOffsetY = 5;
    cav.shadowBlur = 10;
    cav.shadowColor = lightbulb;
    cav.beginPath();
    cav.translate(555, 175);
    cav.rotate(0.6);
    cav.arc(0, 0, 13, 0, 2 * Math.PI)
    cav.fillStyle = lightbulb;
    cav.stroke();
    cav.fill();



}
function moveLamp() {
    // using setInerval to relocate lamp 1 to teh right evey 20ms
    var move = setInterval(function () {
        z += 5;
        cav.clearRect(0, 0, canvas.width, canvas.height); // clears canvas 

        //draw while lamp1 is in place
        titleAndDate();
        drawTable();
        drawLamp2();
        drawLamp1();

        if (z === 200) {
            clearInterval(move);
        }
    }
        , 20);//(every 20ms)
}
    
    function changeColors(event) {
        myColor = document.getElementById("colorPicker").value; //get color that user pickes

        // get x coordinate of mouse inside canvas
        var x = event.clientX - canvas.offsetLeft + document.body.scrollLeft;
        // get y coordinate of mouse inside canvas
        var y = event.clientY - canvas.offsetTop +  document.body.scrollTop;

        //change shade1 color
        if (x > 85 + z && x < 255 + z && y > 105 && y < 205) {
            shade1 = myColor;
            drawLamp1();
        }
        //change semi-circle color
        else if (x > 160 + z && x < 180 + z && y > 207 && y < 217) {
            semicircle = myColor;
            drawLamp1();
        }
        //change trapezoid color 
        else if (x > 155 + z && x < 285 + z && y > 219 && y < 239) {
            trap = myColor;
            drawLamp1();
        }
        // change rectangle with curved slides color
        else if (x > 155 + z && x < 285 + z && y > 239 && y < 320) {
            curvRect = myColor;
            drawLamp1();
        }
        //change lamp1 rectangle color 
        else if (x > 155 + z && x < 185 + z && y > 322 && y < 332) {
            rect = myColor;
            drawLamp1();

        }
        //change lamp1 base color 
        else if (x > 150 +  z && x < 230 + z && y > 330 && y < 360) {
            base1 = myColor;
            drawLamp1();
        }

        // change lamp2 shade color
        else if (x > 520 && x < 600 && y > 120 && y < 160) {
            shade2 = myColor;
            drawLamp2();
        }
        // change lightbulb color
        else if (x > 545 && x < 565 && y > 165 && y < 185) {
            lightbulb = myColor;
            drawLamp2();
        }
        //change inside lamp color
        else if (x > 520 && x < 600 && y > 160 && y < 200) {
            inside = myColor;
            drawLamp2();
        }
        //change inside lamp2  base color
        else if (x > 600 && x < 750 && y > 100 && y < 310) {
            base2 = myColor;
            drawLamp2();

        }
        //change table top color 
        else if (x > 150 && x < 650 && y > 300 && y < 400) {
            tb1Top = myColor;
            drawTable();
        }
        // change table rectangle color 
        else if (x > 50 && x < 750 && y > 400 && y < 430) {
            tb1Rect = myColor;
            drawTable();
        }
        //change leg1 color 
        else if (x > 65 && x < 95 && y > 434 && y < 584) {
            leg1 = myColor;
            drawTable();
        }
        //change leg2 color
        else if (x > 705 && x < 735 && y > 434 && y < 584) {
            leg2 = myColor;
            drawTable();
        }
        //change leg3 color
        else if (x > 150 && x < 175 && y > 434 && y < 484) {
            leg3 = myColor;
            drawTable();
        }
        //change leg4 color
        else if (x > 625 && x < 650 && y > 434 && y < 484) {
            leg4 = myColor;
            drawTable();
        }
    }

    
