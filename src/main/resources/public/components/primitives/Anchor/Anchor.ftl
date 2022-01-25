[#macro Anchor href class target="" current=""]
    <a
    class="custom-anchor[#if class??]${class}[/#if]"
    href="${href}"
    [#if target??]target="${target}"[/#if]
    [#if current??]aria-current="${current}"[/#if]>

        [#nested]
    </a>
[/#macro]