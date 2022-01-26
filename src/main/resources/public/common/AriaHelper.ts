export default class AriaHelper {
     static setAriaCurrent(currentPageName: string) {
        const navigationAnchors = document.querySelectorAll(".custom-nav > a");
        if(navigationAnchors) {
            for(let i = 0; i < navigationAnchors.length; i++) {
                const path = navigationAnchors[i].pathname;
                console.log(navigationAnchors[i]);
                navigationAnchors[i].ariaCurrent = (path.includes(currentPageName)) ? "page" : "";
            }
        }
    }
}
