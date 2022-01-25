[#ftl]
[#include '../../layouts/MainLayout.ftl']

[@MainLayout title="${vm.title}"]
    <h1 class="home-heading">This is ${vm.title} Component!</h1>
[/@MainLayout]
<script type="text/javascript" src="/screens/about/AboutScreen.js"></script>