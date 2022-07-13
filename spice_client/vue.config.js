const path = require('path')
module.exports = {
  transpileDependencies: true,
  lintOnSave: false,
  outputDir: 'dist',
  configureWebpack: {
    resolve: {
      alias: {
        '@': path.resolve('src'),
      }
    }
  },
  devServer:{
    proxy:{
      '/api':{
        target:'http://localhost:8081',
        pathRewrite:{
          '^/api': ''
        }
      }
    }
  }
}
