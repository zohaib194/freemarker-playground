[#ftl]
[#include '../../layouts/MainLayout.ftl']
[#-- @ftlvariable name="vm" type="com.playground.freemarker.ui.viewmodel.HomeViewModel" --]
<link rel="stylesheet" href="/screens/home/HomeScreen.css" />

[@MainLayout title="${vm.title}"]

    <h1 class="home-heading">This is ${vm.title} Component!</h1>
[/@MainLayout]

<script type="text/javascript" src="/screens/home/HomeScreen.js"></script>
