[#ftl]
[#include '../../layouts/MainLayout.ftl']

[@MainLayout title="${vm.title}"]

    <h1 class="home-heading">This is ${vm.title} Component!</h1>
    <button onclick="onButtonClick()">Click me!</button>
[/@MainLayout]
<script type="text/javascript" src="screens/products/ProductsScreen.js"></script>
