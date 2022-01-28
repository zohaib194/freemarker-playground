import './DialogBox.scss'

const dialogCloseButton = document.querySelector(".dialog-box-close-button");

if(dialogCloseButton) {
    dialogCloseButton.addEventListener("onclick", (event) => {
        console.log(event);
    });
}
