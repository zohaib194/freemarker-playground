[#ftl]
[#include '../../layouts/MainLayout.ftl']
[#-- @ftlvariable name="vm" type="com.playground.freemarker.ui.viewmodel.HomeViewModel" --]

[@MainLayout title="${vm.title}"]
    <link rel="stylesheet" href="/components/home/HomeScreen.css" />
    <h1 class="home-heading">This is ${vm.title} Component!</h1>
    <button onclick="executeAction()">Click me!</button>
[/@MainLayout]

<script type="text/javascript" src="/components/home/homeScreen.js"></script>
