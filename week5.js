// javascript styling for week5-1 and 5-2
//by Sirak Berhane 
// April 21 2018

window.onload = pageload;//global code

function pageload() {
    var okButton = document.getElementById("button");
    okButton.onclick = Orderform;
}
// Week5-1 
function Orderform() {

    alert(" Welcome to Rummage store order, please fill all parts of the form");

    var name = prompt("Enter your fist and last name", "John Smith");
    var DOB = prompt("Enter your date of birth ", "01-01-1000");
    var address = prompt("Enter your shipping address",
        "111 oak street ,Kansas City ,MO 64111");
    var date = prompt("Enter the order date", "01-01-1000");
    var color =
        prompt("Enter color choice ? Your options are black, red ,green?", "blue");
    if (confirm("Confirm your color selection: " + color)) { } else {
        color = "black";


    }

    // Confirm the order
    if (confirm("Will this complete your order?")) {
        // Place the order
        alert("Thank you for your order.");
    }
        // Verify the data
        if (name === null || name === "" || name === "undefined" ||
            DOB === null || DOB === "" || DOB === "undefined" ||
            address === null || address === "" || address === "undefined" ||
            date === null || date === "" || date === "undefined" ||
            color === null || color === "" || color === "undefined"
        ) {
            cancelOrder();
        } else {
            // create output message
            message = "We have placed your order.\n" +
                "NAme: " + name + "\n" +
                "Date of Birth: " + DOB + "\n" +
                "Address: " + address + "\n" +
                "Order Date: " + date + "\n" +
               "Color: " + color + "\n";

            // send output message
            alert(message);
            document.write(message);
            results.innerHTML= message;
        }
}
// week 5-2
// create a div


function createDiv() {
    //styling the new content 
    var myMain = document.getElementById("main");
    myMain.insertBefore(myRow, myMain.childNodes[0])
    myRow.className = "row";
    //creating the div secton 
    var divTag = document.createElement("div");
    myRow.appendChild(divTag);
    divTag.id = "onecell"
    divTag.style.position = "absolute";
    divTag.style.top = "250px";
    divTag.style.left = "450px";
    divTag.style.zIndex = "20";
    divTag.innerHTML = "This is information";
}

    