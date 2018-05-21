// Week 6 js code
// by Sirak Berhane 
// April 23 2018



function populateStyles() {
    var styles = "dotted;dashed;solid;groove;double;ridge;none";
    var styleArray = styles.split(';');
    // creating option for each value in array
    for (var i = 0; i < styleArray.length; i++) {
        border = document.createElement("option");
        border.id = "border" + i;
        border.value = styleArray[i];
        border.text = styleArray[i];
        document.getElementById("borderMenu").appendChild(border);
    }
}

function populateFonts() {
    var fonts = "Arial;Times New Roman;Futura:Curlz MT;Papyrus";
    var fontArray = fonts.split(';');
    // creating option for each value in array 
    for (var i = 0; i < fontArray.length; i++) {
        font = document.createElement("option");
        font.id = "font" + i;
        font.value = fontArray[i];
        font.text = fontArray[i];
        document.getElementById("fontMenu").appendChild(font);
    }

}
function populateImages() {
    var imgArray = ["../images/14742.jpg", "../images/37753.jpg",
                    "../images/45989.jpg","../images/67157.jpg"];
    for (var i = 0; i < imgArray.length; i++) {
        // creating radio button
        btn = document.createElement("input");
        btn.type = "radio";
        btn.name = "button";
        //creating each image
        pic = document.createElement("img");
        pic.src = imgArray[i];
        pic.style.paddingRight = "10px";
        pic.style.paddingBottom = "10px";
        pic.setAttribute('height', '120px');
        pic.setAttribute('width', '120px');
        //appending the items above to html
        imgDiv = document.getElementById("image");
        imgDiv.appendChild(btn);
        imgDiv.appendChild(pic);
        // break after two iterations
        if (i % 2 == 1) {
            var br = document.createElement("br");
            imgDiv.appendChild(br);
                

        }
    }
}

// function to process form
function processForm() {
    var ph = document.getElementById("placeholder");

    //append saveTheDate to ph
    var saveTheDateNode = document.createElement("h1");
    var saveTheDateText = document.createTextNode("Save The Date");
    saveTheDateNode.appendChild(saveTheDateText);
    var hr = document.createElement("hr");
    saveTheDateNode.appendChild(hr);
    ph.appendChild(saveTheDateNode);

    //append title to ph
    var titleNode = document.createElement("p");
    var titleText = document.createTextNode(document.getElementById("title").value);
    titleNode.appendChild(titleText);
    ph.appendChild(titleNode);

    //apeend data to ph 
    var createDate = new Date(document.getElementById("date").value);
    var formattedDate = createDate.toLocaleDateString();
    var dateNode = document.createElement("p");
    var dateText = document.createTextNode(formattedDate);
    dateNode.appendChild(dateText);
    ph.appendChild(dateNode);

    //append message to ph
    var messageNode = document.createElement("p");
    var messageText = document.createTextNode(document.getElementById("message").value);
    messageNode.appendChild(messageText);
    ph.appendChild(messageNode);

    //append image to ph
    for (var i = 0; i < document.myForm.button.length; i++ ) {
        if (document.myForm.button[i].checked) {
            y = document.myForm.button[i];
        }
    }
    var x = y.nextSibling.src;
    var imageNode = document.createElement("img");
    imageNode.src = x;
    ph.appendChild(imageNode);

    //modify  styles using values from the form 
    ph.style.fontSize = "18px";
    ph.style.backgroundColor = document.getElementById("bgColor").value;

    ph.style.color = document.getElementById("fontColor").value;
    ph.style.fontFamily = document.getElementById("fontMenu").value;
    ph.style.border = document.getElementById("borderMenu").value;
    ph.style.borderColor = document.getElementById("fontColor").value;
}
