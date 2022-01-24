[#include '../primitives/Anchor/Anchor.ftl']
[#macro Navigation]
    <nav class="custom-nav">
        [@Anchor href="/" class="" target=""]
            <img src="shorturl.at/amJS8" alt="Temprature"></img>
        [/@Anchor]
        [@Anchor href="/products" target="" class="-navigation"]Products[/@Anchor]
        [@Anchor href="/services" target="" class="-navigation"]Services[/@Anchor]
        [@Anchor href="/publications" target="" class="-navigation"]Publications[/@Anchor]
        [@Anchor href="/topics" target="" class="-navigation"]Topics[/@Anchor]
        [@Anchor href="/about" target="" class="-navigation"]About[/@Anchor]
    </nav>
[/#macro]