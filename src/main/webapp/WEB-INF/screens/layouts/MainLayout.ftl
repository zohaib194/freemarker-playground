[#-- @ftlvariable name="vm" type="com.playground.freemarker.ui.viewmodel.MainLayoutViewModel" --]


[#macro MainLayout title]
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>${title!"Main layout"}</title>
            <link rel="stylesheet" href="/layout/mainLayout.css" />
        </head>

        <body class="main-layout">
            <h1>This is Main Layout!</h1>
            [#nested]
        </body>
        <script src="/layout/mainLayout.js"></script>
    </html>
[/#macro]