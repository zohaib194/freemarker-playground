[#include '../primitives/Anchor/Anchor.ftl']
[#macro Navigation]
    <nav class="custom-nav">
        [@Anchor href="/home"class="-navigation" current="page"]
            <img src="https://p7.hiclipart.com/preview/453/536/991/computer-icons-thermometer-temperature-thermometer-icon-vector.jpg" alt="Temprature"></img>
        [/@Anchor]

        [@Anchor href="/products" class="-navigation"]Products[/@Anchor]

        [@Anchor href="/services" class="-navigation"]Services[/@Anchor]


        [@Anchor href="/publications" class="-navigation"]Publications[/@Anchor]

        [@Anchor href="/topics" class="-navigation"]Topics[/@Anchor]

        [@Anchor href="/about" class="-navigation"]About[/@Anchor]
    </nav>
[/#macro]