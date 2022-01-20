[#macro MainLayout title]
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>${title!"Main layout"}</title>
            <link rel="stylesheet" href="MainLayout.scss" />
        </head>

        <body class="main-layout">
            <h1 class="main-heading">This is Main Layout!</h1>
            [#nested]
        </body>
        <script src="MainLayout.ts"></script>
    </html>
[/#macro]