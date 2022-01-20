[#ftl]
[#include '../../layouts/MainLayout.ftl']
[#-- @ftlvariable name="vm" type="com.playground.freemarker.ui.viewmodel.HomeViewModel" --]

[@MainLayout title="${vm.title}"]
    <link rel="stylesheet" href="HomeScreen.scss" />
    <h1>This is ${vm.title} Component!</h1>
[/@MainLayout]

<script src="HomeScreen.ts"></script>
