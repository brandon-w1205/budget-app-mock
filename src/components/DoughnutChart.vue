<script lang="ts">
import {
    Chart as ChartJS,
    Title,
    Tooltip,
    Legend,
    ArcElement,
    CategoryScale,
    LinearScale
} from 'chart.js'
import { Doughnut } from 'vue-chartjs'

ChartJS.register(CategoryScale, LinearScale, ArcElement, Title, Tooltip, Legend)

export default {
    name: 'DoughnutChart',
    components: {
        Doughnut
    },
    data() {
        return {
            data: {
                labels: ['January', 'February', 'March'],
                datasets: [
                    { 
                        data: [40, 20, 12],
                        backgroundColor: ['#41B883', '#E46651', '#00D8FF', '#DD1B16'] 
                    }
                ]
            },
            options: {
                responsive: false
            }
        }
    }
}
</script>

<template>
    <Doughnut :data="data" :options="options" />
</template>