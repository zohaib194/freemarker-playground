[#include '../../layouts/MainLayout.ftl']
[#-- @ftlvariable name="vm" type="com.playground.freemarker.ui.viewmodel.HomeViewModel" --]

[@MainLayout title="${vm.getTitle()}"]
    <link rel="stylesheet" href="homeScreen.css" />
    <h1>This ${vm.getTitle()} Component!</h1>
[/@MainLayout]

<script src="homeScreen.ts"></script>
