/**
 * 该文件用于创建整个应用的路由器
 */
import vueRouter from 'vue-router'

// 引用路由组件
import indexPage from '@/pages/indexPage'
import spiceTableInfo from '@/pages/spiceTableInfo'
import spiceDetailInfo from '@/pages/spiceDetailInfo'

//创建路由器实例
const router = new vueRouter({
    routes:[
        {
            path: '/',
            redirect:'/indexPage'
        },
        {
            path: '/indexPage',
            component:indexPage
        },
        {
            path: '/spiceTableInfo',
            component:spiceTableInfo
        },
        {
            path: '/spiceDetailInfo',
            component:spiceDetailInfo
        }
    ]
})

export default router