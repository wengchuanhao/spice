<template>
    <div>
        {{testData}}
    </div>
</template>

<script>
export default {
    name: 'aTest',

    data() {
        return {
           testData:'no data' 
        };
    },

    mounted() {
        this.getTestData()
    },

    methods: {
        async getTestData(){
            const { data } = await this.$axios.get('/api/test')

            this.testData = data
        }
    },
};
</script>

<style lang="scss" scoped>

</style>