[#ftl]
[#include '../../layouts/MainLayout.ftl']
[#include '../../components/primitives/Anchor/Anchor.ftl']
<link rel="stylesheet" href="/screens/products/ProductsScreen.css" />

[@MainLayout title="${vm.title}"]

    <div class="breadcrumb-container">
        [#list vm.breadcrumbs as breadcrumb]
            [@Anchor href=breadcrumb.href class=breadcrumb.scssClass target=breadcrumb.target current=breadcrumb.ariaCurrent]
                ${breadcrumb.text}
            [/@Anchor]
           [#if breadcrumb?has_next] / [/#if]
        [/#list]
    </div>
    <article class="page-article">
        <h1 class="page-article-header">${vm.title}</h1>
        <p class="page-article-statement">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
    </article>

[/@MainLayout]
<script type="text/javascript" src="screens/products/ProductsScreen.js"></script>
