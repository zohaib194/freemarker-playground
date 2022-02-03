import './DialogBox.scss'

const dialogCloseButton = document.querySelector(".dialog-box-close-button");

if(dialogCloseButton) {
    dialogCloseButton.addEventListener("onclick", (event) => {
        document.querySelector(".dialog-box")?.classList.remove(".show");
        console.log(event);
    });
}
