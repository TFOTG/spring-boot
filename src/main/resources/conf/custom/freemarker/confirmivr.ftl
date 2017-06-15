{
"menu":[
<#list ivr.menu as model>
    <#if menu_index != 0>
    ,
    </#if>
    <#if model.Index==1>wav|
        <#if model.OrderCounts==1>confirm/nh1.wav
        <#elseif model.OrderCounts==2>confirm/nh2.wav
        <#elseif model.OrderCounts==3>confirm/nh3.wav|wav|
            <#if model.Index==1>confirm/dyz.wav
            <#elseif model.Index==2>confirm/dez.wav
            <#elseif model.Index==3>confirm/dsz.wav|wav|
                <#if model.OrderType=="现付订单">confirm/xfdd.wav
                <#elseif model.OrderType=="现付订单变更">confirm/xfddbg.wav
                <#elseif model.OrderType=="预付订单">confirm/yfdd.wav
                <#elseif model.OrderType=="预付订单变更">confirm/yfddbg.wav
                <#elseif model.OrderType=="担保订单">confirm/dbdd.wav
                <#else>confirm/dbddbg.wav|tts|，订单号${model.OrderId}，|wav|confirm/krxm.wav|tts|，${model.GuestNames}，|wav|confirm/rldrq.wav|tts|，${model.StartDateStr}-${model.EndDateStr}，${model.RoomStyle}，${model.RoomCount}间，${model.Breakfast}|wav|confirm/bbsj.wav|tts|，
                    <#if (model.OrderType=="担保订单" || model.OrderType=="预付订单")>整晚保留
                    <#else>${model.KeepTime.StartDateStr}-${model.KeepTime.EndDateStr}|
                        <#if model.Note.IsNeed>wav|confirm/kryq.wav|tts|，${model.Note.Note}|wav|confirm/qr1.wav|

</#list>
]
}
