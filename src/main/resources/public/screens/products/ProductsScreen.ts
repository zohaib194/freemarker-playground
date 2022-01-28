import AriaHelper from '../../common/AriaHelper';
import './ProductsScreen.scss';

console.log("productScreen.ts loaded!");

AriaHelper.setAriaCurrent("products");

window.addEventListener("hashchange", (event) => {
    const hash = window.location.hash;
    if(hash.includes("lg")) {
        const dialog = document.querySelector(".dialog-box")
        if(dialog) {
          dialog.setAttribute("aria-hidden", 'true');
        }
    }
}, false);