[#macro Anchor href class target]
    <a
    class="custom-anchor[#if class??]${class}[/#if]"
    href="${href}"
    [#if target??]target="${target}"[/#if]>

        [#nested]
    </a>
[/#macro]